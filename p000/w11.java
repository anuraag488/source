package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w11 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33018a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ml3 f33019b;

    public /* synthetic */ w11(byte b) {
        this.f33018a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f33018a;
        ml3 ml3Var = this.f33019b;
        switch (b) {
            case 0:
                x11 x11Var = (x11) obj;
                if (!x11Var.f25208n) {
                    return op4.f26939b;
                }
                if (x11Var.f33909q != null) {
                    q32.m9721c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                x11Var.f33909q = null;
                ml3Var.f25002a = ml3Var.f25002a;
                return op4.f26938a;
            default:
                if (!((lx1) obj).f24434q) {
                    return op4.f26938a;
                }
                ml3Var.f25002a = false;
                return op4.f26940c;
        }
    }
}
