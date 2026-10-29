package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p000.C0811ju;
import p000.qf0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalyticsLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return Collections.singletonList(qf0.m9881c(C0811ju.m7283a("fire-analytics-ktx", "22.5.0"), C0811ju.class));
    }
}
