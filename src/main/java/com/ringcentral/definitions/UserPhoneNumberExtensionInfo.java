package com.ringcentral.definitions;


public class UserPhoneNumberExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public Long id;
    /**
     * Canonical URI of an extension
     */
    public String uri;
    /**
     * Number of department extension
     */
    public String extensionNumber;
    /**
     * For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
     */
    public String partnerId;
    /**
     * Extension type
     * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation
     */
    public String type;
    /**
     * CCRN (Contact Center Routing Number) provider. If not specified then the default value 'InContact/North America' is used, its ID is '1'
     */
    public ContactCenterProvider contactCenterProvider;
    /**
     * Extension name. For user extension types the value is a combination of the specified first name and last name
     */
    public String name;

    public UserPhoneNumberExtensionInfo id(Long id) {
        this.id = id;
        return this;
    }

    public UserPhoneNumberExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserPhoneNumberExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public UserPhoneNumberExtensionInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public UserPhoneNumberExtensionInfo type(String type) {
        this.type = type;
        return this;
    }

    public UserPhoneNumberExtensionInfo contactCenterProvider(ContactCenterProvider contactCenterProvider) {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }

    public UserPhoneNumberExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

}
