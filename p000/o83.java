package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o83 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ o83[] f26438a;

    /* JADX INFO: Fake field, exist only in values array */
    o83 EF5;

    static {
        o83[] o83VarArr = {new o83("CounterClockwise", 0), new o83("Clockwise", 1)};
        f26438a = o83VarArr;
        vd6.m11859r(o83VarArr);
    }

    public static o83 valueOf(String str) {
        return (o83) Enum.valueOf(o83.class, str);
    }

    public static o83[] values() {
        return (o83[]) f26438a.clone();
    }
}
