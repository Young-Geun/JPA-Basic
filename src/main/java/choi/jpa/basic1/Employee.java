package choi.jpa.basic1;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    /* 비슷한 속성별로 묶기 (임베디드 타입 사용) */
    /*
        private LocalDateTime startDate;
        private LocalDateTime endDate;

        private String city;
        private String street;
        private String zipcode;
    */

    @Embedded
    private Period wordPeriod;

    @Embedded
    private Address homeAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getWordPeriod() {
        return wordPeriod;
    }

    public void setWordPeriod(Period wordPeriod) {
        this.wordPeriod = wordPeriod;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

}
