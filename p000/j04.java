package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j04 {

    /* JADX INFO: renamed from: a */
    public static final j04 f21933a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ j04[] f21934b;

    static {
        j04 j04Var = new j04("EditableText", 0);
        f21933a = j04Var;
        j04[] j04VarArr = {j04Var, new j04("StaticText", 1)};
        f21934b = j04VarArr;
        vd6.m11859r(j04VarArr);
    }

    public static j04 valueOf(String str) {
        return (j04) Enum.valueOf(j04.class, str);
    }

    public static j04[] values() {
        return (j04[]) f21934b.clone();
    }
}
