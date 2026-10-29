package com.google.android.play.core.hsdp.model;

import java.lang.invoke.VarHandle;
import p000.ka6;

/* JADX INFO: renamed from: com.google.android.play.core.hsdp.model.c */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0537c extends DeepLinkContext.Builder {

    /* JADX INFO: renamed from: a */
    public CallerAppContext f16272a;

    /* JADX INFO: renamed from: b */
    public TargetAppContext f16273b;

    @Override // com.google.android.play.core.hsdp.model.DeepLinkContext.Builder
    public final DeepLinkContext build() {
        CallerAppContext callerAppContext = this.f16272a;
        TargetAppContext targetAppContext = this.f16273b;
        ka6 ka6Var = new ka6();
        ka6Var.f23031a = callerAppContext;
        ka6Var.f23032b = targetAppContext;
        VarHandle.storeStoreFence();
        return ka6Var;
    }

    @Override // com.google.android.play.core.hsdp.model.DeepLinkContext.Builder
    public final DeepLinkContext.Builder setCallerAppContext(CallerAppContext callerAppContext) {
        this.f16272a = callerAppContext;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.DeepLinkContext.Builder
    public final DeepLinkContext.Builder setTargetAppContext(TargetAppContext targetAppContext) {
        this.f16273b = targetAppContext;
        return this;
    }
}
