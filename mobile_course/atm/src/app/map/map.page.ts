import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { Geolocation } from '@capacitor/geolocation';
declare var google;
@Component({
  selector: 'app-map',
  templateUrl: './map.page.html',
  styleUrls: ['./map.page.scss'],
})
export class MapPage implements OnInit {
  @ViewChild('map', { static: true }) mapElement: ElementRef;
  map: any;
  showMap(latitude: any, longitude: any) {
    let latLng = new google.maps.LatLng(latitude, longitude);
    let mapOptions = {
      center: latLng,
      zoom: 10,
      mapTypeId: google.maps.MapTypeId.ROADMAP,
    };
    this.map = new google.maps.Map(this.mapElement.nativeElement, mapOptions);
  }
  constructor() {
    this.getCurrentLocation().then((position: any) => {
      this.showMap(position.coords.latitude, position.coords.longitude);
    });
  }

  getCurrentLocation(): Promise<any> {
    return new Promise((resolve, reject) => {
      const locOptions = {
        maximumAge: 3000,
        timeout: 5000,
        enableHighAccuracy: true,
      };
      Geolocation.getCurrentPosition(locOptions)
        .then((position: any) => {
          resolve(position);
        })
        .catch((e) => {
          reject(e.message);
        });
    });
  }

  ngOnInit() {}
}
