package p000;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: ex */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0629ex extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f18550t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C1354y3 f18551u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ sw2 f18552v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0629ex(C1354y3 c1354y3, sw2 sw2Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f18550t = b;
        this.f18551u = c1354y3;
        this.f18552v = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f18550t;
        sw2 sw2Var = this.f18552v;
        C1354y3 c1354y3 = this.f18551u;
        switch (b) {
            case 0:
                return new C0629ex(c1354y3, sw2Var, wm0Var, (byte) 0);
            default:
                return new C0629ex(c1354y3, sw2Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18550t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((C0629ex) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        AccessibilityNodeInfo rootInActiveWindow;
        AccessibilityNodeInfo accessibilityNodeInfo;
        byte b = this.f18550t;
        sw2 sw2Var = this.f18552v;
        C1354y3 c1354y3 = this.f18551u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                AccessibilityService accessibilityServiceM12815a = c1354y3.m12815a();
                AccessibilityNodeInfo rootInActiveWindow2 = accessibilityServiceM12815a != null ? accessibilityServiceM12815a.getRootInActiveWindow() : null;
                return Boolean.valueOf((rootInActiveWindow2 != null ? (AccessibilityNodeInfo) ((yp1) sw2Var.getValue()).invoke(rootInActiveWindow2) : null) != null);
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                AccessibilityService accessibilityServiceM12815a2 = c1354y3.m12815a();
                return Boolean.valueOf((accessibilityServiceM12815a2 == null || (rootInActiveWindow = accessibilityServiceM12815a2.getRootInActiveWindow()) == null || (accessibilityNodeInfo = (AccessibilityNodeInfo) ((yp1) sw2Var.getValue()).invoke(rootInActiveWindow)) == null || !accessibilityNodeInfo.performAction(16)) ? false : true);
        }
    }
}
