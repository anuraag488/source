package p000;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class bf1 implements ka0 {

    /* JADX INFO: renamed from: a */
    public final File f15233a;

    /* JADX INFO: renamed from: b */
    public final t24 f15234b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f15235c = new AtomicBoolean(false);

    public bf1(File file, t24 t24Var) {
        this.f15233a = file;
        this.f15234b = t24Var;
    }

    @Override // p000.ka0
    public final void close() {
        this.f15235c.set(true);
    }
}
