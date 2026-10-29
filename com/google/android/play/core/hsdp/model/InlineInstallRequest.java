package com.google.android.play.core.hsdp.model;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class InlineInstallRequest {

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class Builder {
        public abstract InlineInstallRequest build();

        public abstract Builder setAutoTrigger(boolean z);

        public abstract Builder setDeepLinkContext(DeepLinkContext deepLinkContext);

        public abstract Builder setDisplayConfig(InlineInstallsDisplayConfig inlineInstallsDisplayConfig);

        public abstract Builder setReferrer(String str);

        public abstract Builder setTargetPackage(String str);
    }

    public static Builder builder() {
        C0540f c0540f = new C0540f();
        c0540f.setAutoTrigger(false);
        return c0540f;
    }

    public abstract boolean autoTrigger();

    public abstract DeepLinkContext deepLinkContext();

    public abstract InlineInstallsDisplayConfig displayConfig();

    public abstract String referrer();

    public abstract String targetPackage();

    public abstract Builder toBuilder();
}
