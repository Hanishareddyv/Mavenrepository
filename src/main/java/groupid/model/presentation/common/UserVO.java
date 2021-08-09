package groupid.model.presentation.common;

import org.appverse.web.framework.backend.api.model.presentation.AbstractPresentationBean;

import java.util.Date;

public class UserVO extends AbstractPresentationBean{

    private Long id;

        private String name;

    private String username;
        private String surname;

    /**
     * Mr, Mrs.. etc
     */
        private String title;

        private Date lastLoggedDate;

    public UserVO() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the lastLoggedDate
     */
    public Date getLastLoggedDate() {
        return lastLoggedDate;
    }

    /**
     * @param lastLoggedDate the lastLoggedDate to set
     */
    public void setLastLoggedDate(Date lastLoggedDate) {
        this.lastLoggedDate = lastLoggedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


