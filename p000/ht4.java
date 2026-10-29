package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ht4 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final ht4 f20850a;

    /* JADX INFO: renamed from: b */
    public static final Handler f20851b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ht4[] f20852c;

    static {
        ht4 ht4Var = new ht4("INSTANCE", 0);
        f20850a = ht4Var;
        f20852c = new ht4[]{ht4Var};
        f20851b = new Handler(Looper.getMainLooper());
    }

    public static ht4 valueOf(String str) {
        return (ht4) Enum.valueOf(ht4.class, str);
    }

    public static ht4[] values() {
        return (ht4[]) f20852c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f20851b.post(runnable);
    }
}
