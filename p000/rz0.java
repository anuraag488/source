package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final rz0 f29741a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ rz0[] f29742b;

    static {
        rz0 rz0Var = new rz0("INSTANCE", 0);
        f29741a = rz0Var;
        f29742b = new rz0[]{rz0Var};
    }

    public static rz0 valueOf(String str) {
        return (rz0) Enum.valueOf(rz0.class, str);
    }

    public static rz0[] values() {
        return (rz0[]) f29742b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
