package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mo1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ mo1[] f25080a;

    /* JADX INFO: Fake field, exist only in values array */
    mo1 EF5;

    static {
        mo1[] mo1VarArr = {new mo1("PENALTY_LOG", 0), new mo1("PENALTY_DEATH", 1), new mo1("DETECT_FRAGMENT_REUSE", 2), new mo1("DETECT_FRAGMENT_TAG_USAGE", 3), new mo1("DETECT_WRONG_NESTED_HIERARCHY", 4), new mo1("DETECT_RETAIN_INSTANCE_USAGE", 5), new mo1("DETECT_SET_USER_VISIBLE_HINT", 6), new mo1("DETECT_TARGET_FRAGMENT_USAGE", 7), new mo1("DETECT_WRONG_FRAGMENT_CONTAINER", 8)};
        f25080a = mo1VarArr;
        vd6.m11859r(mo1VarArr);
    }

    public static mo1 valueOf(String str) {
        return (mo1) Enum.valueOf(mo1.class, str);
    }

    public static mo1[] values() {
        return (mo1[]) f25080a.clone();
    }
}
