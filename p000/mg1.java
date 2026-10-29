package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mg1 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final mg1 f24881a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ mg1[] f24882b;

    static {
        mg1 mg1Var = new mg1("INSTANCE", 0);
        f24881a = mg1Var;
        f24882b = new mg1[]{mg1Var};
    }

    public static mg1 valueOf(String str) {
        return (mg1) Enum.valueOf(mg1.class, str);
    }

    public static mg1[] values() {
        return (mg1[]) f24882b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
