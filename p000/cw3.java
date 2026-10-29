package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cw3 {

    /* JADX INFO: renamed from: a */
    public static final cw3 f16535a;

    /* JADX INFO: renamed from: b */
    public static final cw3 f16536b;

    /* JADX INFO: renamed from: c */
    public static final cw3 f16537c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cw3[] f16538d;

    static {
        cw3 cw3Var = new cw3("NETWORK_UNMETERED", 0);
        f16535a = cw3Var;
        cw3 cw3Var2 = new cw3("DEVICE_IDLE", 1);
        f16536b = cw3Var2;
        cw3 cw3Var3 = new cw3("DEVICE_CHARGING", 2);
        f16537c = cw3Var3;
        f16538d = new cw3[]{cw3Var, cw3Var2, cw3Var3};
    }

    public static cw3 valueOf(String str) {
        return (cw3) Enum.valueOf(cw3.class, str);
    }

    public static cw3[] values() {
        return (cw3[]) f16538d.clone();
    }
}
