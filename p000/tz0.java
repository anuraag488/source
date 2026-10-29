package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tz0 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final tz0 f31554a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ tz0[] f31555b;

    static {
        tz0 tz0Var = new tz0("INSTANCE", 0);
        f31554a = tz0Var;
        tz0[] tz0VarArr = {tz0Var};
        f31555b = tz0VarArr;
        vd6.m11859r(tz0VarArr);
    }

    public static tz0 valueOf(String str) {
        return (tz0) Enum.valueOf(tz0.class, str);
    }

    public static tz0[] values() {
        return (tz0[]) f31555b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
