package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lc1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ lc1[] f23932a;

    /* JADX INFO: Fake field, exist only in values array */
    lc1 EF5;

    static {
        lc1[] lc1VarArr = {new lc1("REPLACE", 0), new lc1("KEEP", 1), new lc1("APPEND", 2), new lc1("APPEND_OR_REPLACE", 3)};
        f23932a = lc1VarArr;
        vd6.m11859r(lc1VarArr);
    }

    public static lc1 valueOf(String str) {
        return (lc1) Enum.valueOf(lc1.class, str);
    }

    public static lc1[] values() {
        return (lc1[]) f23932a.clone();
    }
}
