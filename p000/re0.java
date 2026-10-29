package p000;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class re0 {

    /* JADX INFO: renamed from: a */
    public static final re0 f29201a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f29202b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ re0[] f29203c;

    /* JADX INFO: Fake field, exist only in values array */
    re0 EF0;

    static {
        re0 re0Var = new re0("X86_32", 0);
        re0 re0Var2 = new re0("X86_64", 1);
        re0 re0Var3 = new re0("ARM_UNKNOWN", 2);
        re0 re0Var4 = new re0("PPC", 3);
        re0 re0Var5 = new re0("PPC64", 4);
        re0 re0Var6 = new re0("ARMV6", 5);
        re0 re0Var7 = new re0("ARMV7", 6);
        re0 re0Var8 = new re0("UNKNOWN", 7);
        f29201a = re0Var8;
        re0 re0Var9 = new re0("ARMV7S", 8);
        re0 re0Var10 = new re0("ARM64", 9);
        f29203c = new re0[]{re0Var, re0Var2, re0Var3, re0Var4, re0Var5, re0Var6, re0Var7, re0Var8, re0Var9, re0Var10};
        HashMap map = new HashMap(4);
        f29202b = map;
        map.put("armeabi-v7a", re0Var7);
        map.put("armeabi", re0Var6);
        map.put("arm64-v8a", re0Var10);
        map.put("x86", re0Var);
    }

    public static re0 valueOf(String str) {
        return (re0) Enum.valueOf(re0.class, str);
    }

    public static re0[] values() {
        return (re0[]) f29203c.clone();
    }
}
