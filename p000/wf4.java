package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wf4 {

    /* JADX INFO: renamed from: a */
    public static final wf4 f33339a;

    /* JADX INFO: renamed from: b */
    public static final wf4 f33340b;

    /* JADX INFO: renamed from: c */
    public static final wf4 f33341c;

    /* JADX INFO: renamed from: d */
    public static final wf4 f33342d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wf4[] f33343e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ v91 f33344f;

    static {
        wf4 wf4Var = new wf4("Left", 0);
        f33339a = wf4Var;
        wf4 wf4Var2 = new wf4("Up", 1);
        f33340b = wf4Var2;
        wf4 wf4Var3 = new wf4("Right", 2);
        f33341c = wf4Var3;
        wf4 wf4Var4 = new wf4("Down", 3);
        f33342d = wf4Var4;
        wf4[] wf4VarArr = {wf4Var, wf4Var2, wf4Var3, wf4Var4};
        f33343e = wf4VarArr;
        f33344f = vd6.m11859r(wf4VarArr);
    }

    public static wf4 valueOf(String str) {
        return (wf4) Enum.valueOf(wf4.class, str);
    }

    public static wf4[] values() {
        return (wf4[]) f33343e.clone();
    }
}
