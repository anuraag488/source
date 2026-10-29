package p000;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ec3 {

    /* JADX INFO: renamed from: a */
    public final List f18000a;

    /* JADX INFO: renamed from: b */
    public final rd6 f18001b;

    /* JADX INFO: renamed from: c */
    public final int f18002c;

    /* JADX INFO: renamed from: d */
    public final int f18003d;

    /* JADX INFO: renamed from: e */
    public final int f18004e;

    /* JADX INFO: renamed from: f */
    public int f18005f;

    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    public ec3(List list, rd6 rd6Var) {
        this.f18000a = list;
        this.f18001b = rd6Var;
        MotionEvent motionEventM5080a = m5080a();
        int i = 0;
        this.f18002c = motionEventM5080a != null ? motionEventM5080a.getClassification() : 0;
        MotionEvent motionEventM5080a2 = m5080a();
        this.f18003d = motionEventM5080a2 != null ? motionEventM5080a2.getButtonState() : 0;
        MotionEvent motionEventM5080a3 = m5080a();
        this.f18004e = motionEventM5080a3 != null ? motionEventM5080a3.getMetaState() : 0;
        MotionEvent motionEventM5080a4 = m5080a();
        if (motionEventM5080a4 != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = i2 >= 34 && motionEventM5080a4.getClassification() == 3;
            boolean z2 = i2 >= 34 && motionEventM5080a4.getClassification() == 5;
            int actionMasked = motionEventM5080a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i = 10;
                                } else if (z2) {
                                    i = 7;
                                } else if (!z2) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i = 12;
                                } else if (z2) {
                                    i = 9;
                                } else if (!z2) {
                                    i = 2;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i = 11;
                                } else if (!z2) {
                                    i = 3;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    } else if (z) {
                        i = 11;
                    } else if (!z2) {
                        i = 8;
                    } else {
                        i = 3;
                    }
                } else if (z) {
                    i = 12;
                } else if (!z2 || z2) {
                    i = 2;
                } else {
                    i = 9;
                }
            } else if (z) {
                i = 10;
            } else if (!z2 || z2) {
                i = 1;
            } else {
                i = 7;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    lc3 lc3Var = (lc3) list.get(i);
                    if (AbstractC1356y5.m12923q(lc3Var)) {
                        i = 2;
                    } else if (AbstractC1356y5.m12921o(lc3Var)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.f18005f = i;
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m5080a() {
        rd6 rd6Var = this.f18001b;
        if (rd6Var != null) {
            return (MotionEvent) ((nh3) rd6Var.f29198d).f25811c;
        }
        return null;
    }
}
