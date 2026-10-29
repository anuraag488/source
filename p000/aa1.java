package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aa1 {

    /* JADX INFO: renamed from: a */
    public static final aa1 f204a;

    /* JADX INFO: renamed from: b */
    public static final aa1 f205b;

    /* JADX INFO: renamed from: c */
    public static final aa1 f206c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ aa1[] f207d;

    /* JADX INFO: Fake field, exist only in values array */
    aa1 EF0;

    static {
        aa1 aa1Var = new aa1("SHA1", 0);
        aa1 aa1Var2 = new aa1("SHA224", 1);
        aa1 aa1Var3 = new aa1("SHA256", 2);
        f204a = aa1Var3;
        aa1 aa1Var4 = new aa1("SHA384", 3);
        f205b = aa1Var4;
        aa1 aa1Var5 = new aa1("SHA512", 4);
        f206c = aa1Var5;
        f207d = new aa1[]{aa1Var, aa1Var2, aa1Var3, aa1Var4, aa1Var5};
    }

    public static aa1 valueOf(String str) {
        return (aa1) Enum.valueOf(aa1.class, str);
    }

    public static aa1[] values() {
        return (aa1[]) f207d.clone();
    }
}
