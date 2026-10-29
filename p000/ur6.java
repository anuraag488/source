package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ur6 {

    /* JADX INFO: renamed from: a */
    public String f32122a;

    /* JADX INFO: renamed from: b */
    public boolean f32123b;

    /* JADX INFO: renamed from: c */
    public final cb6 f32124c;

    /* JADX INFO: renamed from: d */
    public BitSet f32125d;

    /* JADX INFO: renamed from: e */
    public BitSet f32126e;

    /* JADX INFO: renamed from: f */
    public C0805jo f32127f;

    /* JADX INFO: renamed from: g */
    public C0805jo f32128g = new C0805jo(0);

    /* JADX INFO: renamed from: h */
    public /* synthetic */ vn5 f32129h;

    public ur6(vn5 vn5Var, String str, cb6 cb6Var, BitSet bitSet, BitSet bitSet2, C0805jo c0805jo, C0805jo c0805jo2) {
        this.f32129h = vn5Var;
        this.f32122a = str;
        this.f32125d = bitSet;
        this.f32126e = bitSet2;
        this.f32127f = c0805jo;
        for (Integer num : (C0695go) c0805jo2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c0805jo2.get(num));
            this.f32128g.put(num, arrayList);
        }
        this.f32123b = false;
        this.f32124c = cb6Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m11636a(fn5 fn5Var) {
        int iM5511p;
        String str = this.f32122a;
        C0805jo c0805jo = this.f32128g;
        C0805jo c0805jo2 = this.f32127f;
        switch (fn5Var.f19151g) {
            case 0:
                iM5511p = ((f46) fn5Var.f19153i).m5511p();
                break;
            default:
                iM5511p = ((u46) fn5Var.f19153i).m11240p();
                break;
        }
        boolean z = true;
        if (fn5Var.f19147c != null) {
            this.f32126e.set(iM5511p, true);
        }
        Boolean bool = fn5Var.f19148d;
        if (bool != null) {
            this.f32125d.set(iM5511p, bool.booleanValue());
        }
        if (fn5Var.f19149e != null) {
            Integer numValueOf = Integer.valueOf(iM5511p);
            Long l = (Long) c0805jo2.get(numValueOf);
            long jLongValue = fn5Var.f19149e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (fn5Var.f19150f != null) {
            Integer numValueOf2 = Integer.valueOf(iM5511p);
            List arrayList = (List) c0805jo.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0805jo.put(numValueOf2, arrayList);
            }
            boolean zM5516u = false;
            switch (fn5Var.f19151g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            fn6.m5761a();
            oa6 oa6Var = (oa6) this.f32129h.f36084a;
            op5 op5Var = oa6Var.f26512d;
            d56 d56Var = e56.f17728F0;
            if (op5Var.m9225E(str, d56Var)) {
                switch (fn5Var.f19151g) {
                    case 0:
                        zM5516u = ((f46) fn5Var.f19153i).m5516u();
                        break;
                }
                if (zM5516u) {
                    arrayList.clear();
                }
            }
            fn6.m5761a();
            boolean zM9225E = oa6Var.f26512d.m9225E(str, d56Var);
            Long l2 = fn5Var.f19150f;
            if (!zM9225E) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX INFO: renamed from: b */
    public final r86 m11637b(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        C0805jo c0805jo = this.f32128g;
        C0805jo c0805jo2 = this.f32127f;
        q86 q86VarM10236v = r86.m10236v();
        q86VarM10236v.m11054c();
        ((r86) q86VarM10236v.f31181b).m10244w(i);
        boolean z = this.f32123b;
        q86VarM10236v.m11054c();
        ((r86) q86VarM10236v.f31181b).m10247z(z);
        cb6 cb6Var = this.f32124c;
        if (cb6Var != null) {
            q86VarM10236v.m11054c();
            ((r86) q86VarM10236v.f31181b).m10246y(cb6Var);
        }
        bb6 bb6VarM3954w = cb6.m3954w();
        ArrayList arrayListM9776f0 = q76.m9776f0(this.f32125d);
        bb6VarM3954w.m11054c();
        ((cb6) bb6VarM3954w.f31181b).m3956A(arrayListM9776f0);
        ArrayList arrayListM9776f1 = q76.m9776f0(this.f32126e);
        bb6VarM3954w.m11054c();
        ((cb6) bb6VarM3954w.f31181b).m3970y(arrayListM9776f1);
        if (c0805jo2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(c0805jo2.f34030c);
            for (Integer num : (C0695go) c0805jo2.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) c0805jo2.get(num);
                if (l != null) {
                    h96 h96VarM7055s = j96.m7055s();
                    h96VarM7055s.m11054c();
                    ((j96) h96VarM7055s.f31181b).m7060t(iIntValue);
                    long jLongValue = l.longValue();
                    h96VarM7055s.m11054c();
                    ((j96) h96VarM7055s.f31181b).m7061u(jLongValue);
                    arrayList.add((j96) h96VarM7055s.m11056e());
                }
            }
        }
        if (arrayList != null) {
            bb6VarM3954w.m11054c();
            ((cb6) bb6VarM3954w.f31181b).m3958C(arrayList);
        }
        if (c0805jo == null) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(c0805jo.f34030c);
            for (Integer num2 : (C0695go) c0805jo.keySet()) {
                eb6 eb6VarM5630t = fb6.m5630t();
                int iIntValue2 = num2.intValue();
                eb6VarM5630t.m11054c();
                ((fb6) eb6VarM5630t.f31181b).m5636u(iIntValue2);
                List list = (List) c0805jo.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    eb6VarM5630t.m11054c();
                    ((fb6) eb6VarM5630t.f31181b).m5637v(list);
                }
                arrayList2.add((fb6) eb6VarM5630t.m11056e());
            }
        }
        bb6VarM3954w.m11054c();
        ((cb6) bb6VarM3954w.f31181b).m3960E((List) arrayList2);
        q86VarM10236v.m11054c();
        ((r86) q86VarM10236v.f31181b).m10245x((cb6) bb6VarM3954w.m11056e());
        return (r86) q86VarM10236v.m11056e();
    }
}
