package p000;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gu2 {

    /* JADX INFO: renamed from: a */
    public long f20129a;

    /* JADX INFO: renamed from: b */
    public SparseLongArray f20130b;

    /* JADX INFO: renamed from: c */
    public SparseBooleanArray f20131c;

    /* JADX INFO: renamed from: d */
    public ArrayList f20132d;

    /* JADX INFO: renamed from: e */
    public po2 f20133e;

    /* JADX INFO: renamed from: f */
    public int f20134f;

    /* JADX INFO: renamed from: g */
    public int f20135g;

    /* JADX INFO: renamed from: h */
    public boolean f20136h;

    /* JADX INFO: renamed from: i */
    public boolean f20137i;

    /* JADX INFO: renamed from: j */
    public b33 f20138j;

    /* JADX INFO: renamed from: a */
    public final void m6165a(MotionEvent motionEvent) {
        SparseLongArray sparseLongArray = this.f20130b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f20129a;
                this.f20129a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.f20129a;
            this.f20129a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f20131c.put(pointerId2, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6166b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f20134f && source == this.f20135g) {
            return;
        }
        this.f20134f = toolType;
        this.f20135g = source;
        this.f20131c.clear();
        this.f20130b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final nh3 m6167c(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc) {
        int actionIndex;
        SparseBooleanArray sparseBooleanArray = this.f20131c;
        ArrayList arrayList = this.f20132d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f20130b.clear();
            sparseBooleanArray.clear();
            this.f20136h = false;
            this.f20137i = false;
            this.f20138j = null;
            return null;
        }
        m6166b(motionEvent);
        m6165a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.f20136h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || !(motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
            this.f20137i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(m6168d(viewTreeObserverOnGlobalLayoutListenerC1140sc, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.f20136h = false;
                    this.f20137i = false;
                    this.f20138j = null;
                }
                m6169e(motionEvent);
                return null;
            }
            this.f20137i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f20138j = b33.m3423a((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                this.f20138j = b33.m3423a((((long) Float.floatToRawIntBits((motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f)) & 4294967295L));
            }
            arrayList.add(m6168d(viewTreeObserverOnGlobalLayoutListenerC1140sc, motionEvent, this.f20138j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f20136h = false;
            this.f20137i = false;
            this.f20138j = null;
        }
        m6169e(motionEvent);
        motionEvent.getEventTime();
        nh3 nh3Var = new nh3((byte) 29, false);
        nh3Var.f25810b = arrayList;
        nh3Var.f25811c = motionEvent;
        VarHandle.storeStoreFence();
        return nh3Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a A[EDGE_INSN: B:74:0x017a->B:56:0x017a BREAK  A[LOOP:0: B:39:0x00e5->B:55:0x0174], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final nc3 m6168d(ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, MotionEvent motionEvent, b33 b33Var, int i, boolean z) {
        long jValueAt;
        char c;
        long jFloatToRawIntBits;
        char c2;
        long j;
        long jM10602G;
        char c3;
        int i2;
        int historySize;
        int i3;
        long jFloatToRawIntBits2;
        float fFloatValue;
        long jFloatToRawIntBits3;
        Float fValueOf;
        float historicalX;
        long j2;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.f20130b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j3 = this.f20129a;
            this.f20129a = 1 + j3;
            sparseLongArray.put(pointerId, j3);
            jValueAt = j3;
        }
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i == 0) {
            if (b33Var != null) {
                c2 = ' ';
                jFloatToRawIntBits = b33Var.f15059a;
                j2 = 4294967295L;
            } else {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                j2 = 4294967295L;
                long jFloatToRawIntBits5 = Float.floatToRawIntBits(rawX);
                int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
                c2 = ' ';
                jFloatToRawIntBits = (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits5 << 32);
            }
            j = j2;
            jM10602G = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10602G(jFloatToRawIntBits);
        } else {
            if (b33Var != null) {
                jFloatToRawIntBits = b33Var.f15059a;
                c = ' ';
            } else {
                c = ' ';
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32);
            }
            c2 = c;
            j = 4294967295L;
            jM10602G = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10602G(jFloatToRawIntBits);
        }
        int toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            c3 = c2;
            i2 = 2;
            if (toolType != 1) {
                if (toolType == 2) {
                    i2 = 3;
                } else if (toolType != 3) {
                    i2 = 4;
                    if (toolType != 4) {
                    }
                }
            } else if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.f20136h && !this.f20137i)) {
                i2 = 1;
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i3 = 0;
            while (true) {
                jFloatToRawIntBits2 = 0;
                fFloatValue = 1.0f;
                if (i3 < historySize) {
                    break;
                }
                historicalX = motionEvent.getHistoricalX(i, i3);
                float historicalY = motionEvent.getHistoricalY(i, i3);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(historicalX)) << c3) | (((long) Float.floatToRawIntBits(historicalY)) & j);
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                    float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                    fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                    arrayList.add(new mw1(historicalEventTime, jFloatToRawIntBits6, fValueOf != null ? fValueOf.floatValue() : 1.0f, motionEvent.getClassification() == 3 ? (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << c3) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j) : 0L, jFloatToRawIntBits6));
                }
                i3++;
                historySize = historySize;
            }
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c3) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j);
            } else {
                jFloatToRawIntBits3 = 0;
            }
            if (motionEvent.getClassification() == 5) {
                float axisValue = motionEvent.getAxisValue(52, i);
                fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
            float f = fFloatValue;
            if (motionEvent.getClassification() == 3) {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c3) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
            }
            long j4 = jFloatToRawIntBits2;
            boolean z2 = this.f20131c.get(motionEvent.getPointerId(i), false);
            long eventTime = motionEvent.getEventTime();
            nc3 nc3Var = new nc3();
            nc3Var.f25673a = jValueAt;
            nc3Var.f25674b = eventTime;
            nc3Var.f25675c = jFloatToRawIntBits;
            nc3Var.f25676d = jM10602G;
            nc3Var.f25677e = z;
            nc3Var.f25678f = pressure;
            nc3Var.f25679g = i2;
            nc3Var.f25680h = z2;
            nc3Var.f25681i = arrayList;
            nc3Var.f25682j = jFloatToRawIntBits3;
            nc3Var.f25683k = f;
            nc3Var.f25684l = j4;
            nc3Var.f25685m = jFloatToRawIntBits4;
            VarHandle.storeStoreFence();
            return nc3Var;
        }
        c3 = c2;
        i2 = 0;
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        i3 = 0;
        while (true) {
            jFloatToRawIntBits2 = 0;
            fFloatValue = 1.0f;
            if (i3 < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY2 = motionEvent.getHistoricalY(i, i3);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i3++;
            historySize = historySize;
        }
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c3) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j);
        } else {
            jFloatToRawIntBits3 = 0;
        }
        if (motionEvent.getClassification() == 5) {
            float axisValue2 = motionEvent.getAxisValue(52, i);
            if (axisValue2 > 0.0f) {
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        float f2 = fFloatValue;
        if (motionEvent.getClassification() == 3) {
            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c3) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
        }
        long j5 = jFloatToRawIntBits2;
        boolean z3 = this.f20131c.get(motionEvent.getPointerId(i), false);
        long eventTime2 = motionEvent.getEventTime();
        nc3 nc3Var2 = new nc3();
        nc3Var2.f25673a = jValueAt;
        nc3Var2.f25674b = eventTime2;
        nc3Var2.f25675c = jFloatToRawIntBits;
        nc3Var2.f25676d = jM10602G;
        nc3Var2.f25677e = z;
        nc3Var2.f25678f = pressure;
        nc3Var2.f25679g = i2;
        nc3Var2.f25680h = z3;
        nc3Var2.f25681i = arrayList2;
        nc3Var2.f25682j = jFloatToRawIntBits3;
        nc3Var2.f25683k = f2;
        nc3Var2.f25684l = j5;
        nc3Var2.f25685m = jFloatToRawIntBits4;
        VarHandle.storeStoreFence();
        return nc3Var2;
    }

    /* JADX INFO: renamed from: e */
    public final void m6169e(MotionEvent motionEvent) {
        SparseBooleanArray sparseBooleanArray = this.f20131c;
        SparseLongArray sparseLongArray = this.f20130b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
