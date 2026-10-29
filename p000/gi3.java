package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gi3 implements ei3 {

    /* JADX INFO: renamed from: a */
    public oe3 f19806a;

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        HashMap map = this.f19806a.f26657a;
        Iterable arrayList = (List) map.get(oe3.f26656b);
        List list = bArr.length >= 5 ? (List) map.get(u50.m11248a(5, bArr)) : null;
        if (arrayList == null && list == null) {
            arrayList = new ArrayList();
        } else if (arrayList == null) {
            arrayList = list;
        } else if (list != null) {
            me3 me3Var = new me3((byte) 0);
            me3Var.f24839b = list;
            me3Var.f24840c = arrayList;
            VarHandle.storeStoreFence();
            arrayList = me3Var;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((fi3) it.next()).f19016a.mo4729a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        xy4.m12788q("invalid signature");
    }
}
