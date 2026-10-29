package p000;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc0 implements DoubleUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25630a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f25631b;

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        byte b = this.f25630a;
        yp1 yp1Var = this.f25631b;
        switch (b) {
            case 0:
                break;
        }
        return ((Number) yp1Var.invoke(Double.valueOf(d))).doubleValue();
    }
}
