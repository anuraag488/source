package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class or1 implements ls2 {

    /* JADX INFO: renamed from: b */
    public static final or1 f26991b = new or1(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26992a;

    public /* synthetic */ or1(byte b) {
        this.f26992a = b;
    }

    @Override // p000.ls2
    /* JADX INFO: renamed from: a */
    public final qj3 mo8101a(Class cls) {
        switch (this.f26992a) {
            case 0:
                if (!tr1.class.isAssignableFrom(cls)) {
                    C1077qn.m9987m("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (qj3) tr1.m11094j(cls.asSubclass(tr1.class)).mo124i(3);
                } catch (Exception e) {
                    xy4.m12785n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.ls2
    /* JADX INFO: renamed from: b */
    public final boolean mo8102b(Class cls) {
        switch (this.f26992a) {
            case 0:
                return tr1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
