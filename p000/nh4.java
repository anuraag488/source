package p000;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nh4 extends ViewGroup implements lk2, av3, u33 {

    /* JADX INFO: renamed from: a */
    public zg4 f25812a;

    /* JADX INFO: renamed from: b */
    public yg4 f25813b;

    /* JADX INFO: renamed from: c */
    public pg0 f25814c;

    /* JADX INFO: renamed from: d */
    public ok2 f25815d;

    /* JADX INFO: renamed from: e */
    public pq3 f25816e;

    /* JADX INFO: renamed from: f */
    public t33 f25817f;

    /* JADX INFO: renamed from: g */
    public js1 f25818g;

    /* JADX INFO: renamed from: h */
    public mw3 f25819h;

    /* JADX INFO: renamed from: i */
    public WindowManager f25820i;

    /* JADX INFO: renamed from: j */
    public y94 f25821j;

    /* JADX INFO: renamed from: k */
    public LinkedHashMap f25822k;

    /* JADX INFO: renamed from: l */
    public LinkedHashMap f25823l;

    /* JADX INFO: renamed from: m */
    public wp1 f25824m;

    /* JADX INFO: renamed from: n */
    public wp1 f25825n;

    /* JADX INFO: renamed from: o */
    public a83 f25826o;

    /* JADX INFO: renamed from: p */
    public xn2 f25827p;

    /* JADX INFO: renamed from: q */
    public mh4 f25828q;

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAttachVersion() {
        return this.f25826o.m132h();
    }

    private final void setAttachVersion(int i) {
        this.f25826o.m133i(i);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[LOOP:6: B:51:0x0126->B:52:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x013f A[LOOP:7: B:54:0x013d->B:55:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116 A[EDGE_INSN: B:92:0x0116->B:50:0x0116 BREAK  A[LOOP:4: B:44:0x0101->B:93:?, LOOP_LABEL: LOOP:4: B:44:0x0101->B:93:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:4: B:44:0x0101->B:93:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:5: B:45:0x0103->B:94:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final boolean m8763b(MotionEvent motionEvent, fh4 fh4Var) {
        int i;
        int i2;
        int i3;
        Iterator it;
        long j;
        long j2;
        int size;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        int i4;
        int size2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        int i5;
        boolean zDispatchTouchEvent;
        LinkedHashMap linkedHashMap = this.f25822k;
        int iIdentityHashCode = System.identityHashCode(fh4Var);
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        l73 l73Var = new l73(Integer.valueOf(iIdentityHashCode), Integer.valueOf(pointerId));
        char c = 6;
        boolean z = actionMasked == 1 || actionMasked == 6;
        boolean z2 = actionMasked == 3;
        if (!z && !z2) {
            int pointerCount = motionEvent.getPointerCount();
            int i6 = 0;
            while (i6 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i6);
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                motionEvent.getPointerProperties(i6, pointerProperties);
                char c2 = c;
                pointerProperties.id = m8764c(iIdentityHashCode, pointerId2);
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                motionEvent.getPointerCoords(i6, pointerCoords);
                l73 l73Var2 = new l73(Integer.valueOf(iIdentityHashCode), Integer.valueOf(pointerId2));
                boolean z3 = z;
                long downTime = motionEvent.getDownTime();
                ih4 ih4Var = new ih4();
                ih4Var.f21421a = pointerProperties;
                ih4Var.f21422b = pointerCoords;
                ih4Var.f21423c = downTime;
                VarHandle.storeStoreFence();
                linkedHashMap.put(l73Var2, ih4Var);
                i6++;
                c = c2;
                z = z3;
                z2 = z2;
            }
        }
        boolean z4 = z;
        boolean z5 = z2;
        List listM6319e1 = hb0.m6319e1(linkedHashMap.values());
        if (listM6319e1.isEmpty()) {
            zDispatchTouchEvent = false;
        } else {
            int iM8764c = m8764c(iIdentityHashCode, pointerId);
            Iterator it2 = listM6319e1.iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (((ih4) it2.next()).f21421a.id == iM8764c) {
                    break;
                }
                i7++;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            if (actionMasked == 0) {
                i = 1;
                if (listM6319e1.size() > 1) {
                    i2 = (i7 << 8) | 5;
                }
                i3 = i2;
                it = listM6319e1.iterator();
                if (it.hasNext()) {
                    xy4.m12795x();
                    return false;
                }
                j = ((ih4) it.next()).f21423c;
                loop4: while (true) {
                    j2 = j;
                    while (true) {
                        if (it.hasNext()) {
                            break loop4;
                        }
                        j = ((ih4) it.next()).f21423c;
                        if (j2 > j) {
                        }
                    }
                }
                long eventTime = motionEvent.getEventTime();
                int size3 = listM6319e1.size();
                size = listM6319e1.size();
                pointerPropertiesArr = new MotionEvent.PointerProperties[size];
                for (i4 = 0; i4 < size; i4++) {
                    pointerPropertiesArr[i4] = ((ih4) listM6319e1.get(i4)).f21421a;
                }
                size2 = listM6319e1.size();
                pointerCoordsArr = new MotionEvent.PointerCoords[size2];
                for (i5 = 0; i5 < size2; i5++) {
                    pointerCoordsArr[i5] = ((ih4) listM6319e1.get(i5)).f21422b;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(j2, eventTime, i3, size3, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                zDispatchTouchEvent = this.f25828q.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            } else {
                i = 1;
            }
            i2 = (actionMasked != i || listM6319e1.size() <= i) ? actionMasked | (i7 << 8) : (i7 << 8) | 6;
            i3 = i2;
            it = listM6319e1.iterator();
            if (it.hasNext()) {
                xy4.m12795x();
                return false;
            }
            j = ((ih4) it.next()).f21423c;
            loop4: while (true) {
                j2 = j;
                while (true) {
                    if (it.hasNext()) {
                        break loop4;
                        break loop4;
                    }
                    j = ((ih4) it.next()).f21423c;
                    if (j2 > j) {
                    }
                }
            }
            long eventTime2 = motionEvent.getEventTime();
            int size4 = listM6319e1.size();
            size = listM6319e1.size();
            pointerPropertiesArr = new MotionEvent.PointerProperties[size];
            while (i4 < size) {
                pointerPropertiesArr[i4] = ((ih4) listM6319e1.get(i4)).f21421a;
            }
            size2 = listM6319e1.size();
            pointerCoordsArr = new MotionEvent.PointerCoords[size2];
            while (i5 < size2) {
                pointerCoordsArr[i5] = ((ih4) listM6319e1.get(i5)).f21422b;
            }
            MotionEvent motionEventObtain2 = MotionEvent.obtain(j2, eventTime2, i3, size4, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            zDispatchTouchEvent = this.f25828q.dispatchTouchEvent(motionEventObtain2);
            motionEventObtain2.recycle();
        }
        if (z4) {
            linkedHashMap.remove(l73Var);
        } else if (z5) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                if (((Number) ((l73) it3.next()).f23833a).intValue() == iIdentityHashCode) {
                    it3.remove();
                }
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it4 = setKeySet.iterator();
            while (it4.hasNext()) {
                if (((Number) ((l73) it4.next()).f23833a).intValue() == iIdentityHashCode) {
                    return zDispatchTouchEvent;
                }
            }
        }
        this.f25823l.remove(Integer.valueOf(iIdentityHashCode));
        return zDispatchTouchEvent;
    }

    /* JADX INFO: renamed from: c */
    public final int m8764c(int i, int i2) {
        xn2 xn2Var;
        LinkedHashMap linkedHashMap = this.f25823l;
        Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i));
        Integer numValueOf = Integer.valueOf(i);
        Object objValueOf = linkedHashMap.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(numValueOf, objValueOf);
        }
        int iIntValue = ((Number) objValueOf).intValue();
        if (num == null && (xn2Var = this.f25827p) != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                StringBuilder sbM13624x = zi4.m13624x("ALLOC slot=", iIntValue, " view=", i, " origId=");
                sbM13624x.append(i2);
                sbM13624x.append(" slots=");
                sbM13624x.append(linkedHashMap);
                xn2Var.m12722b(k44Var, strM12721a, sbM13624x.toString(), null);
            }
        }
        int i3 = (iIntValue * 4) + i2;
        if (i3 >= 0 && i3 < 32) {
            return i3;
        }
        xy4.m12780h(zi4.m13618r(iIntValue, i2, "pointer id overflow: slot=", " originalId="));
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        wp1 wp1Var = this.f25824m;
        if (wp1Var == null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        wp1Var.invoke();
        wp1 wp1Var2 = this.f25825n;
        if (wp1Var2 != null && (windowInsets2 = (WindowInsets) wp1Var2.invoke()) != null) {
            this.f25828q.dispatchApplyWindowInsets(windowInsets2);
        }
        return windowInsets;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        tc2 tc2Var;
        boolean z;
        Integer num;
        b70 b70Var;
        js1 js1Var = this.f25818g;
        if (js1Var != null) {
            int keyCode = keyEvent.getKeyCode();
            int action = keyEvent.getAction();
            if (action == 0) {
                tc2Var = tc2.f31070a;
            } else {
                if (action != 1) {
                    C1077qn.m9985k(c75.m3877i(keyEvent.getAction(), "unexpected action "));
                    return false;
                }
                tc2Var = tc2.f31071b;
            }
            r50 r50Var = i41.f21117b;
            as4.m3239R(keyEvent.getEventTime(), m41.MILLISECONDS);
            bc2 bc2Var = new bc2();
            VarHandle.storeStoreFence();
            yc2 yc2Var = (yc2) js1Var.f22555a;
            if (yc2Var != null) {
                tc2 tc2Var2 = yc2Var.f35115c;
                if ((tc2Var2 == null || tc2Var2 == tc2Var) && (((num = yc2Var.f35116d) == null || num.intValue() == keyCode) && (b70Var = yc2Var.f35114b) != null)) {
                    yc2Var.f35114b = null;
                    b70Var.resumeWith(bc2Var);
                }
                z = bc2Var.f15205a;
            } else {
                z = false;
            }
            if (!z) {
                if (super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
        } else if (super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // p000.lk2
    public gk2 getLifecycle() {
        return this.f25815d;
    }

    @Override // p000.u33
    public t33 getOnBackPressedDispatcher() {
        return this.f25817f;
    }

    @Override // p000.av3
    public yu3 getSavedStateRegistry() {
        return (yu3) this.f25816e.f27897c;
    }

    public final zg4 getState() {
        return this.f25812a;
    }

    public final y94 getTouchAreas() {
        return this.f25821j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((ok2) getLifecycle()).m9156h(fk2.f19058e);
        setAttachVersion(getAttachVersion() + 1);
        this.f25812a.f36074h.setValue(Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((ok2) getLifecycle()).m9156h(fk2.f19056c);
        this.f25812a.f36074h.setValue(Boolean.FALSE);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mh4 mh4Var = this.f25828q;
        mh4Var.layout(0, 0, mh4Var.getMeasuredWidth(), mh4Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Rect bounds = this.f25820i.getMaximumWindowMetrics().getBounds();
        this.f25828q.measure(View.MeasureSpec.makeMeasureSpec(bounds.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(bounds.height(), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
