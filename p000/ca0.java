package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ca0 {

    /* JADX INFO: renamed from: a */
    public static final ca0 f15901a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ca0[] f15902b;

    /* JADX INFO: Fake field, exist only in values array */
    ca0 EF0;

    static {
        ca0 ca0Var = new ca0("UNKNOWN", 0);
        ca0 ca0Var2 = new ca0("ANDROID_FIREBASE", 1);
        f15901a = ca0Var2;
        f15902b = new ca0[]{ca0Var, ca0Var2};
    }

    public static ca0 valueOf(String str) {
        return (ca0) Enum.valueOf(ca0.class, str);
    }

    public static ca0[] values() {
        return (ca0[]) f15902b.clone();
    }
}
