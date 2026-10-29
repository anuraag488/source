package com.google.android.libraries.ads.mobile.sdk.internal.util;

import android.os.Bundle;
import java.io.IOException;
import p000.kb2;
import p000.ou1;
import p000.uq4;
import p000.yb2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class BundleTypeAdapter extends uq4 {

    /* JADX INFO: renamed from: a */
    public ou1 f16268a;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) {
        return new Bundle();
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        Bundle bundle = (Bundle) obj;
        if (yb2Var == null) {
            return;
        }
        if (bundle == null) {
            yb2Var.mo12211t();
            return;
        }
        yb2Var.mo12207e();
        for (String str : bundle.keySet()) {
            if (str != null) {
                yb2Var.mo12210l(str);
                Object obj2 = bundle.get(str);
                if (obj2 == null) {
                    yb2Var.mo12211t();
                } else {
                    this.f16268a.m9277j(obj2, obj2.getClass(), yb2Var);
                }
            }
        }
        yb2Var.mo12209k();
    }
}
