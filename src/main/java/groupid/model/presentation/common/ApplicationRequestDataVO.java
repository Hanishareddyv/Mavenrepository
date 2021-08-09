package groupid.model.presentation.common;
import org.appverse.web.framework.backend.api.model.presentation.AbstractPresentationBean;

public class ApplicationRequestDataVO extends AbstractPresentationBean{
        private String language;

        private String appVersion;

    public ApplicationRequestDataVO() {
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion the appVersion to set
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

}
