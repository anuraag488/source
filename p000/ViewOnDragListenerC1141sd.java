package p000;

import android.view.DragEvent;
import android.view.View;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: sd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC1141sd implements View.OnDragListener, v11 {

    /* JADX INFO: renamed from: a */
    public x11 f30174a;

    /* JADX INFO: renamed from: b */
    public C0879lo f30175b;

    /* JADX INFO: renamed from: c */
    public C1104rd f30176c;

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0879lo c0879lo = this.f30175b;
        x11 x11Var = this.f30174a;
        js1 js1Var = new js1();
        js1Var.f22555a = dragEvent;
        VarHandle.storeStoreFence();
        switch (dragEvent.getAction()) {
            case 1:
                x11Var.getClass();
                ml3 ml3Var = new ml3();
                w11 w11Var = new w11((byte) 0);
                w11Var.f33019b = ml3Var;
                VarHandle.storeStoreFence();
                if (w11Var.invoke(x11Var) == op4.f26938a) {
                    dt0.m4698a0(x11Var, w11Var);
                }
                boolean z = ml3Var.f25002a;
                c0879lo.getClass();
                C0658fo c0658fo = new C0658fo(c0879lo);
                while (c0658fo.hasNext()) {
                    ((x11) c0658fo.next()).m12455S0();
                }
                return z;
            case 2:
                x11Var.m12454R0(js1Var);
                return false;
            case 3:
                return x11Var.m12451O0();
            case 4:
                x11Var.getClass();
                C1127s c1127s = new C1127s((byte) 28);
                c1127s.f29778b = js1Var;
                VarHandle.storeStoreFence();
                if (c1127s.invoke(x11Var) == op4.f26938a) {
                    dt0.m4698a0(x11Var, c1127s);
                }
                c0879lo.clear();
                return false;
            case 5:
                x11Var.m12452P0();
                return false;
            case 6:
                x11Var.m12453Q0();
                return false;
            default:
                return false;
        }
    }
}
