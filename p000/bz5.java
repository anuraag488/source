package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bz5 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final bz5 f15714a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bz5[] f15715b;

    static {
        bz5 bz5Var = new bz5("INSTANCE", 0);
        f15714a = bz5Var;
        f15715b = new bz5[]{bz5Var};
    }

    public static bz5[] values() {
        return (bz5[]) f15715b.clone();
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
