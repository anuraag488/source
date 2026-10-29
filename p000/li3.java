package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class li3 {

    /* JADX INFO: renamed from: a */
    public static final li3 f24057a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ li3[] f24058b;

    static {
        li3 li3Var = new li3("DEFAULT", 0);
        f24057a = li3Var;
        li3 li3Var2 = new li3("UNMETERED_ONLY", 1);
        li3 li3Var3 = new li3("UNMETERED_OR_DAILY", 2);
        li3 li3Var4 = new li3("FAST_IF_RADIO_AWAKE", 3);
        li3 li3Var5 = new li3("NEVER", 4);
        li3 li3Var6 = new li3("UNRECOGNIZED", 5);
        f24058b = new li3[]{li3Var, li3Var2, li3Var3, li3Var4, li3Var5, li3Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, li3Var);
        sparseArray.put(1, li3Var2);
        sparseArray.put(2, li3Var3);
        sparseArray.put(3, li3Var4);
        sparseArray.put(4, li3Var5);
        sparseArray.put(-1, li3Var6);
    }

    public static li3 valueOf(String str) {
        return (li3) Enum.valueOf(li3.class, str);
    }

    public static li3[] values() {
        return (li3[]) f24058b.clone();
    }
}
