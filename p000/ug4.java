package p000;

import ads_mobile_sdk.kl2;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ug4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f31859t = 1;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f31860u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f31861v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f31862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug4(List list, int i, WindowManager windowManager, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31861v = list;
        this.f31860u = i;
        this.f31862w = windowManager;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f31859t;
        int i = this.f31860u;
        Object obj2 = this.f31862w;
        switch (b) {
            case 0:
                return new ug4((List) this.f31861v, i, (WindowManager) obj2, wm0Var);
            default:
                ug4 ug4Var = new ug4((kl2) obj2, i, wm0Var);
                ug4Var.f31861v = obj;
                return ug4Var;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31859t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((ug4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                break;
            default:
                ((ug4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f31859t;
        ju4 ju4Var = ju4.f22634a;
        int i = 0;
        int i2 = this.f31860u;
        Object obj2 = this.f31862w;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                List list = (List) this.f31861v;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((wg4) obj3).f33369b > i2) {
                        arrayList.add(obj3);
                    }
                }
                WindowManager windowManager = (WindowManager) obj2;
                int size = arrayList.size();
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    wg4 wg4Var = (wg4) obj4;
                    windowManager.removeViewImmediate(wg4Var.f33368a);
                    View view = wg4Var.f33368a;
                    windowManager.addView(view, view.getLayoutParams());
                }
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                zo0 zo0Var = (zo0) this.f31861v;
                kl2 kl2Var = (kl2) obj2;
                r52 r52VarM10660c0 = sc6.m10660c0(0, i2);
                ArrayList arrayList2 = new ArrayList(ib0.m6717y0(r52VarM10660c0, 10));
                Iterator it = r52VarM10660c0.iterator();
                while (true) {
                    q52 q52Var = (q52) it;
                    if (!q52Var.f28225c) {
                        kl2Var.f6389g = arrayList2;
                    } else {
                        q52Var.nextInt();
                        arrayList2.add(lb5.m7910S(zo0Var, kl2Var.f6384b, null, new wp4(kl2Var, null, (byte) 8), 2));
                    }
                    break;
                }
                break;
        }
        return ju4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug4(kl2 kl2Var, int i, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31862w = kl2Var;
        this.f31860u = i;
    }
}
