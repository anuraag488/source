package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f18347t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f18348u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f18349v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Iterable f18350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ro0 f18351x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1260vl f18352y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(int i, Iterable iterable, ro0 ro0Var, C1260vl c1260vl, wm0 wm0Var) {
        super(2, wm0Var);
        this.f18349v = i;
        this.f18350w = iterable;
        this.f18351x = ro0Var;
        this.f18352y = c1260vl;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        ep0 ep0Var = new ep0(this.f18349v, this.f18350w, this.f18351x, this.f18352y, wm0Var);
        ep0Var.f18348u = obj;
        return ep0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ep0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        zo0 zo0Var = (zo0) this.f18348u;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f18347t;
        if (z) {
            if (z) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        int i = w14.f33029a;
        v14 v14Var = new v14(this.f18349v, 0);
        Iterable iterable = this.f18350w;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(lb5.m7937r(zo0Var, this.f18351x, new a00(v14Var, this.f18352y, it.next(), null, (byte) 1), 2));
        }
        this.f18348u = null;
        this.f18347t = true;
        Object objM11845d = vd6.m11845d(arrayList, this);
        return objM11845d == ap0Var ? ap0Var : objM11845d;
    }
}
