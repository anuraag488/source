package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface my4 {
    /* JADX INFO: renamed from: a */
    default jy4 mo3725a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX INFO: renamed from: b */
    default jy4 mo3726b(Class cls, gv2 gv2Var) {
        return mo3725a(cls);
    }

    /* JADX INFO: renamed from: c */
    default jy4 mo3727c(r90 r90Var, gv2 gv2Var) {
        return mo3726b(r90Var.f29101a, gv2Var);
    }
}
