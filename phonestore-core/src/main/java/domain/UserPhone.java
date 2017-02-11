package domain;

import javax.persistence.*;

@Entity
@Table(name = "USER_PHONE")
public class UserPhone {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "phone_id")
    private Phone phone;
    @Column(name="phone_number")
    private Long phoneNumber;
    private String operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "UserPhone{" +
                "id=" + id +
                ", user=" + user +
                ", phone=" + phone +
                ", phoneNumber=" + phoneNumber +
                ", operator='" + operator + '\'' +
                '}';
    }
}
