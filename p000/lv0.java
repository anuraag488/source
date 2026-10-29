package p000;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lv0 implements t01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24383a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f24384b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24385c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24386d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f24387e;

    public /* synthetic */ lv0(byte b) {
        this.f24383a = b;
    }

    @Override // p000.t01
    /* JADX INFO: renamed from: a */
    public final void mo4339a() {
        switch (this.f24383a) {
            case 0:
                Set set = (Set) this.f24385c;
                Object obj = this.f24387e;
                boolean zRemove = set.remove(obj);
                if (!((Set) this.f24386d).contains(obj) && zRemove) {
                    List list = (List) this.f24384b.getValue();
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = hb0.m6312X0(list).iterator();
                        while (it.hasNext()) {
                            ((oy2) it.next()).f27232a.invoke(obj);
                        }
                    } else {
                        int size = list.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i = size - 1;
                                ((oy2) list.get(size)).f27232a.invoke(obj);
                                if (i >= 0) {
                                    size = i;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                sw2 sw2Var = this.f24384b;
                if (((Boolean) sw2Var.getValue()).booleanValue()) {
                    x21 x21Var = (x21) ((sw2) this.f24386d).getValue();
                    if (x21Var != null) {
                        lb5.m7910S((zo0) this.f24387e, null, null, new e31(x21Var, null, (byte) 0), 3);
                    }
                    if (((Boolean) sw2Var.getValue()).booleanValue()) {
                        ((wp1) this.f24385c).invoke();
                    }
                    sw2Var.setValue(Boolean.FALSE);
                }
                break;
        }
    }
}
