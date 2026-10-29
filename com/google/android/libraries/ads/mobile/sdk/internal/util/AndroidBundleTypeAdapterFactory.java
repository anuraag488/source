package com.google.android.libraries.ads.mobile.sdk.internal.util;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import p000.cs4;
import p000.ou1;
import p000.uq4;
import p000.vq4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidBundleTypeAdapterFactory implements vq4 {
    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        if (!Bundle.class.isAssignableFrom(cs4Var.f16429a)) {
            return null;
        }
        BundleTypeAdapter bundleTypeAdapter = new BundleTypeAdapter();
        bundleTypeAdapter.f16268a = ou1Var;
        VarHandle.storeStoreFence();
        return bundleTypeAdapter;
    }
}
