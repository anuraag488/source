package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 {

    /* JADX INFO: renamed from: a */
    public static final mf0 f24854a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ mf0[] f24855b;

    /* JADX INFO: Fake field, exist only in values array */
    mf0 EF0;

    static {
        mf0 mf0Var = new mf0("NOT_SET", 0);
        mf0 mf0Var2 = new mf0("EVENT_OVERRIDE", 1);
        f24854a = mf0Var2;
        f24855b = new mf0[]{mf0Var, mf0Var2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, mf0Var);
        sparseArray.put(5, mf0Var2);
    }

    public static mf0 valueOf(String str) {
        return (mf0) Enum.valueOf(mf0.class, str);
    }

    public static mf0[] values() {
        return (mf0[]) f24855b.clone();
    }
}
