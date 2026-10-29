package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vm2 implements i44 {

    /* JADX INFO: renamed from: a */
    public Bundle f32732a;

    @Override // p000.i44
    /* JADX INFO: renamed from: a */
    public final Boolean mo6660a() {
        Bundle bundle = this.f32732a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p000.i44
    /* JADX INFO: renamed from: b */
    public final Double mo6661b() {
        Bundle bundle = this.f32732a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p000.i44
    /* JADX INFO: renamed from: c */
    public final Object mo6662c(wm0 wm0Var) {
        return ju4.f22634a;
    }

    @Override // p000.i44
    /* JADX INFO: renamed from: d */
    public final i41 mo6663d() {
        Bundle bundle = this.f32732a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return i41.m6644c(as4.m3238Q(bundle.getInt("firebase_sessions_sessions_restart_timeout"), m41.SECONDS));
        }
        return null;
    }
}
