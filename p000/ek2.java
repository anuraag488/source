package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ek2 {
    private static final /* synthetic */ u91 $ENTRIES;
    private static final /* synthetic */ ek2[] $VALUES;
    public static final ck2 Companion;
    public static final ek2 ON_ANY;
    public static final ek2 ON_CREATE;
    public static final ek2 ON_DESTROY;
    public static final ek2 ON_PAUSE;
    public static final ek2 ON_RESUME;
    public static final ek2 ON_START;
    public static final ek2 ON_STOP;

    static {
        ek2 ek2Var = new ek2("ON_CREATE", 0);
        ON_CREATE = ek2Var;
        ek2 ek2Var2 = new ek2("ON_START", 1);
        ON_START = ek2Var2;
        ek2 ek2Var3 = new ek2("ON_RESUME", 2);
        ON_RESUME = ek2Var3;
        ek2 ek2Var4 = new ek2("ON_PAUSE", 3);
        ON_PAUSE = ek2Var4;
        ek2 ek2Var5 = new ek2("ON_STOP", 4);
        ON_STOP = ek2Var5;
        ek2 ek2Var6 = new ek2("ON_DESTROY", 5);
        ON_DESTROY = ek2Var6;
        ek2 ek2Var7 = new ek2("ON_ANY", 6);
        ON_ANY = ek2Var7;
        ek2[] ek2VarArr = {ek2Var, ek2Var2, ek2Var3, ek2Var4, ek2Var5, ek2Var6, ek2Var7};
        $VALUES = ek2VarArr;
        $ENTRIES = vd6.m11859r(ek2VarArr);
        Companion = new ck2();
    }

    public static ek2 valueOf(String str) {
        return (ek2) Enum.valueOf(ek2.class, str);
    }

    public static ek2[] values() {
        return (ek2[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final fk2 m5149a() {
        switch (dk2.f17119a[ordinal()]) {
            case 1:
            case 2:
                return fk2.f19056c;
            case 3:
            case 4:
                return fk2.f19057d;
            case 5:
                return fk2.f19058e;
            case 6:
                return fk2.f19054a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                C0670g.m5864c();
                return null;
        }
    }
}
