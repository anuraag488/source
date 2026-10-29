package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class w04 {

    /* JADX INFO: renamed from: a */
    public static final ds3 f33010a = wv1.f33774q;

    /* JADX INFO: renamed from: a */
    public static final boolean m12040a(ec3 ec3Var) {
        MotionEvent motionEventM5080a;
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((lc3) list.get(i)).f23943i != 2) {
                MotionEvent motionEventM5080a2 = ec3Var.m5080a();
                if ((motionEventM5080a2 == null || !motionEventM5080a2.isFromSource(8194)) && ((motionEventM5080a = ec3Var.m5080a()) == null || !motionEventM5080a.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
