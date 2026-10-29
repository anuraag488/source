package com.google.android.play.core.hsdp.model;

/* JADX INFO: renamed from: com.google.android.play.core.hsdp.model.g */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0541g extends InlineInstallRequest {

    /* JADX INFO: renamed from: a */
    public String f16291a;

    /* JADX INFO: renamed from: b */
    public String f16292b;

    /* JADX INFO: renamed from: c */
    public boolean f16293c;

    /* JADX INFO: renamed from: d */
    public InlineInstallsDisplayConfig f16294d;

    /* JADX INFO: renamed from: e */
    public DeepLinkContext f16295e;

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest
    public final boolean autoTrigger() {
        return this.f16293c;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest
    public final DeepLinkContext deepLinkContext() {
        return this.f16295e;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest
    public final InlineInstallsDisplayConfig displayConfig() {
        return this.f16294d;
    }

    public final boolean equals(Object obj) {
        String str;
        InlineInstallsDisplayConfig inlineInstallsDisplayConfig;
        DeepLinkContext deepLinkContext;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InlineInstallRequest) {
            InlineInstallRequest inlineInstallRequest = (InlineInstallRequest) obj;
            if (this.f16291a.equals(inlineInstallRequest.targetPackage()) && ((str = this.f16292b) != null ? str.equals(inlineInstallRequest.referrer()) : inlineInstallRequest.referrer() == null) && this.f16293c == inlineInstallRequest.autoTrigger() && ((inlineInstallsDisplayConfig = this.f16294d) != null ? inlineInstallsDisplayConfig.equals(inlineInstallRequest.displayConfig()) : inlineInstallRequest.displayConfig() == null) && ((deepLinkContext = this.f16295e) != null ? deepLinkContext.equals(inlineInstallRequest.deepLinkContext()) : inlineInstallRequest.deepLinkContext() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f16291a.hashCode() ^ 1000003;
        String str = this.f16292b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.f16293c ? 1237 : 1231)) * 1000003;
        InlineInstallsDisplayConfig inlineInstallsDisplayConfig = this.f16294d;
        int iHashCode3 = (iHashCode2 ^ (inlineInstallsDisplayConfig == null ? 0 : inlineInstallsDisplayConfig.hashCode())) * 1000003;
        DeepLinkContext deepLinkContext = this.f16295e;
        return iHashCode3 ^ (deepLinkContext != null ? deepLinkContext.hashCode() : 0);
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest
    public final String referrer() {
        return this.f16292b;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest
    public final String targetPackage() {
        return this.f16291a;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest
    public final InlineInstallRequest.Builder toBuilder() {
        C0540f c0540f = new C0540f();
        c0540f.f16285a = this.f16291a;
        c0540f.f16286b = this.f16292b;
        c0540f.f16287c = this.f16293c;
        c0540f.f16288d = this.f16294d;
        c0540f.f16289e = this.f16295e;
        c0540f.f16290f = true;
        return c0540f;
    }

    public final String toString() {
        DeepLinkContext deepLinkContext = this.f16295e;
        return "InlineInstallRequest{targetPackage=" + this.f16291a + ", referrer=" + this.f16292b + ", autoTrigger=" + this.f16293c + ", displayConfig=" + String.valueOf(this.f16294d) + ", deepLinkContext=" + String.valueOf(deepLinkContext) + '}';
    }
}
