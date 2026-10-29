package p000;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 implements t01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23021a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xz4 f23022b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f23023c;

    @Override // p000.t01
    /* JADX INFO: renamed from: a */
    public final void mo4339a() {
        switch (this.f23021a) {
            case 0:
                xz4 xz4Var = this.f23022b;
                Integer num = (Integer) xz4Var.f34749d.getValue();
                int i = this.f23023c;
                if (num != null && num.intValue() == i) {
                    xz4Var.f34748c.setValue(null);
                }
                break;
            default:
                xz4 xz4Var2 = this.f23022b;
                AbstractC0003a2 abstractC0003a2M12171e = xz4Var2.f34750e.m12171e();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                ListIterator listIterator = abstractC0003a2M12171e.listIterator(0);
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    if (((wz4) next).f33880a == this.f23023c) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    wz4 wz4Var = (wz4) obj;
                    a70 a70Var = wz4Var.f33882c;
                    if (a70Var != null) {
                        if (!a70Var.mo112b()) {
                            a70Var = null;
                        }
                        if (a70Var != null) {
                            a70Var.resumeWith(null);
                        }
                    }
                    xz4Var2.f34750e.remove(wz4Var);
                }
                break;
        }
    }
}
