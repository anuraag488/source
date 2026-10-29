package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mp0 implements Callable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f25094a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ np0 f25095b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f25094a);
        this.f25095b.f26003k.mo3143k(bundle);
        return null;
    }
}
