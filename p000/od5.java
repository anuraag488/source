package p000;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface od5 {
    /* JADX INFO: renamed from: a */
    Object mo640a(String str, String str2, UUID uuid, i41 i41Var, ym0 ym0Var);

    /* JADX INFO: renamed from: a */
    default Object m9046a(String str, String str2, ym0 ym0Var) {
        return mo640a(str, str2, UUID.randomUUID(), null, ym0Var);
    }

    /* JADX INFO: renamed from: a */
    Object mo1612a(wa2 wa2Var, wm0 wm0Var);
}
