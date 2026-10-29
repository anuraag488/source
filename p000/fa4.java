package p000;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa4 implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ AtomicBoolean f18881a;

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f18881a.set((i & 8) != 0);
    }
}
