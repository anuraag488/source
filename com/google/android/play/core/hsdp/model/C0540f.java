package com.google.android.play.core.hsdp.model;

import java.lang.invoke.VarHandle;
import p000.C1077qn;
import p000.xy4;

/* JADX INFO: renamed from: com.google.android.play.core.hsdp.model.f */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0540f extends InlineInstallRequest.Builder {

    /* JADX INFO: renamed from: a */
    public String f16285a;

    /* JADX INFO: renamed from: b */
    public String f16286b;

    /* JADX INFO: renamed from: c */
    public boolean f16287c;

    /* JADX INFO: renamed from: d */
    public InlineInstallsDisplayConfig f16288d;

    /* JADX INFO: renamed from: e */
    public DeepLinkContext f16289e;

    /* JADX INFO: renamed from: f */
    public boolean f16290f;

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest.Builder
    public final InlineInstallRequest build() {
        String str;
        if (!this.f16290f || (str = this.f16285a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f16285a == null) {
                sb.append(" targetPackage");
            }
            if (!this.f16290f) {
                sb.append(" autoTrigger");
            }
            C1077qn.m9989o("Missing required properties:".concat(sb.toString()));
            return null;
        }
        String str2 = this.f16286b;
        boolean z = this.f16287c;
        InlineInstallsDisplayConfig inlineInstallsDisplayConfig = this.f16288d;
        DeepLinkContext deepLinkContext = this.f16289e;
        C0541g c0541g = new C0541g();
        c0541g.f16291a = str;
        c0541g.f16292b = str2;
        c0541g.f16293c = z;
        c0541g.f16294d = inlineInstallsDisplayConfig;
        c0541g.f16295e = deepLinkContext;
        VarHandle.storeStoreFence();
        return c0541g;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest.Builder
    public final InlineInstallRequest.Builder setAutoTrigger(boolean z) {
        this.f16287c = z;
        this.f16290f = true;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest.Builder
    public final InlineInstallRequest.Builder setDeepLinkContext(DeepLinkContext deepLinkContext) {
        this.f16289e = deepLinkContext;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest.Builder
    public final InlineInstallRequest.Builder setDisplayConfig(InlineInstallsDisplayConfig inlineInstallsDisplayConfig) {
        this.f16288d = inlineInstallsDisplayConfig;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest.Builder
    public final InlineInstallRequest.Builder setReferrer(String str) {
        this.f16286b = str;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallRequest.Builder
    public final InlineInstallRequest.Builder setTargetPackage(String str) {
        if (str != null) {
            this.f16285a = str;
            return this;
        }
        xy4.m12782k("Null targetPackage");
        return null;
    }
}
