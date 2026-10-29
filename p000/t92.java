package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t92 implements m23 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31010a;

    public /* synthetic */ t92(byte b) {
        this.f31010a = b;
    }

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        switch (this.f31010a) {
            case 0:
                throw new k81("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                n23 n23Var = (n23) obj2;
                n23Var.mo8479a(uh3.f31870g, entry.getKey());
                n23Var.mo8479a(uh3.f31871h, entry.getValue());
                return;
            default:
                throw new k81("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
