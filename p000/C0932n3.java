package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0932n3 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25414a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ he0 f25415b;

    public /* synthetic */ C0932n3(byte b) {
        this.f25414a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        boolean zM6364a;
        ow1 ow1Var;
        byte b = this.f25414a;
        he0 he0Var = this.f25415b;
        switch (b) {
            case 0:
                zM6364a = he0Var.m6364a();
                break;
            case 1:
                zM6364a = he0Var.m6364a();
                break;
            default:
                w94 w94Var = he0Var.f20510a;
                boolean z = false;
                if (w94Var == null || !w94Var.isEmpty()) {
                    ListIterator listIterator = w94Var.listIterator();
                    do {
                        ow1Var = (ow1) listIterator;
                        if (ow1Var.hasNext()) {
                        }
                    } while (!((Boolean) ((wp1) ow1Var.next()).invoke()).booleanValue());
                    z = true;
                }
                return Boolean.valueOf(z);
        }
        return Boolean.valueOf(zM6364a);
    }
}
