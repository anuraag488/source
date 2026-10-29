package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p000.AbstractC0894m2;
import p000.d26;
import p000.jp5;
import p000.oh6;
import p000.qo5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends AbstractC0894m2 implements ReflectedParcelable {

    /* JADX INFO: renamed from: d */
    public List f16252d;

    /* JADX INFO: renamed from: e */
    public static final List f16251e = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new qo5((byte) 0);

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            return this.f16252d.equals(((LocationResult) obj).f16252d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16252d});
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = jp5.f22509a;
        List<Location> list = this.f16252d;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = jp5.f22510b;
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (location.isMock()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat3 = jp5.f22509a;
                sb.append(decimalFormat3.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb.append("±");
                    sb.append(decimalFormat2.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat2.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat2.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat2.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getBearingAccuracyDegrees()));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string2 = extras != null ? extras.getString("floorLabel") : null;
                if (string2 != null) {
                    sb.append(", fl=");
                    sb.append(string2);
                }
                Bundle extras2 = location.getExtras();
                String string3 = extras2 != null ? extras2.getString("levelId") : null;
                if (string3 != null) {
                    sb.append(", lv=");
                    sb.append(string3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + jCurrentTimeMillis;
                if (elapsedRealtimeNanos >= 0) {
                    string = d26.f16751a.format(new Date(elapsedRealtimeNanos));
                } else {
                    SimpleDateFormat simpleDateFormat = d26.f16751a;
                    string = Long.toString(elapsedRealtimeNanos);
                }
                sb.append(string);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9090O(parcel, 1, this.f16252d);
        oh6.m9094S(parcel, iM9092Q);
    }
}
